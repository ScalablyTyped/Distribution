organization := "com.scalablytyped"
name := "cfb"
version := "1.1.0-372c27"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adler-32" % "1.2.0-cf8f62",
  "com.scalablytyped" %%% "commander" % "2.19.0-5a68a9",
  "com.scalablytyped" %%% "crc-32" % "1.2.0-7fa596",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "printj" % "1.1.2-512629",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        