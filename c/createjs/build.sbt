organization := "com.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180910Z-ac8c95"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180910Z-826474",
  "com.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181120Z-96f467",
  "com.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180910Z-56a4cd",
  "com.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180910Z-a50eb9",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180910Z-28b45b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        