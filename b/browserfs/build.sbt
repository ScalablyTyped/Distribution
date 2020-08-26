organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-5741e7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20200515Z-95c048",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200515Z-fc5e2f",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200515Z-55a26d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
