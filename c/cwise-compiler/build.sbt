organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20180214Z-09e1b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-b8ef2f",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-81fac8",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        