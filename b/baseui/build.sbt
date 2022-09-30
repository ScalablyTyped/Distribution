organization := "org.scalablytyped"
name := "baseui"
version := "12.1.3-6fc5d8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axe-core" % "4.4.3-f15a2b",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-34f40d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-multi-ref" % "1.0.1-727691",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "styletron-react" % "6.1.0-715e80",
  "org.scalablytyped" %%% "styletron-standard" % "3.1.0-225bae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
