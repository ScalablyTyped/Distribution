organization := "com.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20180927Z-684818"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181120Z-59b60d",
  "com.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-c6b91a",
  "com.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-807cfc",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        