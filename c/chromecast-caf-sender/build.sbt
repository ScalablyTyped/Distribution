organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20190213Z-c3407e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190218Z-cc6670",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-3fa419",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-cdadb6",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        