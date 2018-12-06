organization := "org.scalablytyped"
name := "chrome-apps"
version := "0.0-unknown-dt-20181116Z-b3ccb2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-6244c3",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-99632e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        