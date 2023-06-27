organization := "org.scalablytyped"
name := "data-urls"
version := "3.0-dt-20220913Z-80a861"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-ceb98b",
  "org.scalablytyped" %%% "whatwg-mimetype" % "3.0-dt-20220913Z-d6c3ef",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20230328Z-960c92")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
