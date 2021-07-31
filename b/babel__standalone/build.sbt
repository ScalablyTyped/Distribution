organization := "org.scalablytyped"
name := "babel__standalone"
version := "7.1-dt-20200924Z-6111ae"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20201102Z-6543ad",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20200925Z-bb6e55",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-e54b91",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20201112Z-d2029a",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-0af1a5",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-b1a5d6",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
