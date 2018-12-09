organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180910Z-3247dc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180910Z-6b1d37",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180910Z-f16a26",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180910Z-1afa1a",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180910Z-2dfbba",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        