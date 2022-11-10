organization := "org.scalablytyped"
name := "contentstack"
version := "3.15.4-a7406a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "contentstack__utils" % "1.1.3-689234",
  "org.scalablytyped" %%% "css-select" % "5.1.0-57f82d",
  "org.scalablytyped" %%% "css-what" % "6.1.0-c3ba0b",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-c4daf1",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
