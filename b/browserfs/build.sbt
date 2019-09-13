organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-4fcda3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20190322Z-6f975c",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-397f1c",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-136595",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        