organization := "org.scalablytyped"
name := "contentstack"
version := "3.15.4-9f201b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "contentstack__utils" % "1.1.3-c654ca",
  "org.scalablytyped" %%% "css-select" % "5.1.0-9f2e62",
  "org.scalablytyped" %%% "css-what" % "6.1.0-28de3b",
  "org.scalablytyped" %%% "node-html-parser" % "6.1.1-b2a3ce",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
