organization := "org.scalablytyped"
name := "data-urls"
version := "2.0-dt-20201012Z-b68d6f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "webidl-conversions" % "6.1-dt-20200625Z-3c361e",
  "org.scalablytyped" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-3b15af",
  "org.scalablytyped" %%% "whatwg-url" % "8.0-dt-20200519Z-36e6ee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
