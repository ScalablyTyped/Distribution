organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20180214Z-7924c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-5e858b",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20180310Z-06e79f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        