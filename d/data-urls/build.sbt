organization := "org.scalablytyped"
name := "data-urls"
version := "2.0-dt-20201012Z-47cb51"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "webidl-conversions" % "6.1-dt-20200625Z-dc8ace",
  "org.scalablytyped" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-5f6a1f",
  "org.scalablytyped" %%% "whatwg-url" % "8.0-dt-20200519Z-aa6402")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
