organization := "org.scalablytyped"
name := "baseui"
version := "9.105.0-44b5f8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "card-validator" % "8.1.0-21862c",
  "org.scalablytyped" %%% "credit-card-type" % "9.1.0-2946fc",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "date-fns" % "2.16.1-24b354",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "styletron-react" % "5.0-dt-20190925Z-8649b8",
  "org.scalablytyped" %%% "styletron-standard" % "2.0-dt-20200731Z-7b3852")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
