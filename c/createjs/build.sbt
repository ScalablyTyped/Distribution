organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180910Z-0bb209"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180910Z-745b8e",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181120Z-2a7588",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180910Z-ae2f36",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180910Z-b48c67",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180910Z-df52c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        