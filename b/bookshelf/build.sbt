organization := "org.scalablytyped"
name := "bookshelf"
version := "v1.2.0-dt-20220818Z-e94b92"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-c67867",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20220818Z-c9bccf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-c0791d",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
