organization := "org.scalablytyped"
name := "data-urls"
version := "3.0-dt-20220913Z-209178"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-ea4bdf",
  "org.scalablytyped" %%% "whatwg-mimetype" % "3.0-dt-20220913Z-5c6266",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20220829Z-939cda")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
