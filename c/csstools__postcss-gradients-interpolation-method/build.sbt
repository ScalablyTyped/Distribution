organization := "org.scalablytyped"
name := "csstools__postcss-gradients-interpolation-method"
version := "3.0.6-abb0dd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstools__color-helpers" % "2.1.0-640814",
  "org.scalablytyped" %%% "csstools__css-color-parser" % "1.2.1-42994a",
  "org.scalablytyped" %%% "csstools__css-parser-algorithms" % "2.2.0-9c14d4",
  "org.scalablytyped" %%% "csstools__css-tokenizer" % "2.1.1-0e6383",
  "org.scalablytyped" %%% "postcss" % "8.4.24-d6da6b",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cdb3bd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
