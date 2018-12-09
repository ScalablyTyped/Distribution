organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180910Z-9be48a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180910Z-be3dd0",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181120Z-67e51c",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180910Z-6fcdd3",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180910Z-79ab63",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180910Z-86310d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        