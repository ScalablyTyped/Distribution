organization := "org.scalablytyped"
name := "cfb"
version := "1.1.0-5d88c5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-91aed2",
  "org.scalablytyped" %%% "commander" % "2.19.0-cf4cd1",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-e560b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "printj" % "1.1.2-aef0ba",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        