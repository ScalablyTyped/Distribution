organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-703c1c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-54e6ef",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-f561a2",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-37a164",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-64e584",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-52c796",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        