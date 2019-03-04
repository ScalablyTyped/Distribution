organization := "org.scalablytyped"
name := "create-emotion"
version := "10.0.7-563ba5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-a901f7",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-818ba9",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-3f3db3",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-002494",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        