organization := "org.scalablytyped"
name := "data-urls"
version := "3.0-dt-20220913Z-5c634a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-fff0ce",
  "org.scalablytyped" %%% "whatwg-mimetype" % "3.0-dt-20220913Z-de0179",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20220829Z-eb9341")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
