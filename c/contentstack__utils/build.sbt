organization := "org.scalablytyped"
name := "contentstack__utils"
version := "1.1.3-5e2d70"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "css-select" % "5.1.0-893397",
  "org.scalablytyped" %%% "css-what" % "6.1.0-7d79d6",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-aceb82",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
