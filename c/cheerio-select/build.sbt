organization := "org.scalablytyped"
name := "cheerio-select"
version := "2.1.0-6b3410"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "css-select" % "5.1.0-5f3105",
  "org.scalablytyped" %%% "css-what" % "6.1.0-637c44",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-bb46e2",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-df5082",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
