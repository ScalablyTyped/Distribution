organization := "org.scalablytyped"
name := "cheerio-select"
version := "2.1.0-2bd5d6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "css-select" % "5.1.0-b6f63e",
  "org.scalablytyped" %%% "css-what" % "6.1.0-eb8ba9",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-6dc867",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-cb323d",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
