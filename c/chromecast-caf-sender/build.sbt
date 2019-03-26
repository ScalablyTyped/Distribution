organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20190213Z-b926f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190322Z-bf5846",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-23127e",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-4335ac",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        