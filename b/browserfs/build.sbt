organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-0be9d1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20200226Z-32c7e5",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0b7aec",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200226Z-e61265",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
