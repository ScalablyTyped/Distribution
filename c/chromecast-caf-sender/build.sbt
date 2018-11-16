organization := "com.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20181102Z-7653b6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181102Z-6e19ca",
  "com.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20181102Z-2ae8ac",
  "com.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20181102Z-b84797",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        