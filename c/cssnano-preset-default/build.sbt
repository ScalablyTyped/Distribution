organization := "org.scalablytyped"
name := "cssnano-preset-default"
version := "5.2.12-7b96bc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserslist" % "4.21.4-994ede",
  "org.scalablytyped" %%% "postcss" % "8.4.16-aeb026",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-4da518",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
