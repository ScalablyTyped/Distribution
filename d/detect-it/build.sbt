organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180910Z-6d42c9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180910Z-7c01da",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180910Z-fec7ec",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180910Z-5e1949",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180910Z-96f8dd",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        