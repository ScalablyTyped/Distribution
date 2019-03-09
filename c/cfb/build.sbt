organization := "org.scalablytyped"
name := "cfb"
version := "1.1.0-ae077a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-5b028a",
  "org.scalablytyped" %%% "commander" % "2.19.0-ea996e",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-d68812",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "printj" % "1.1.2-392669",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        