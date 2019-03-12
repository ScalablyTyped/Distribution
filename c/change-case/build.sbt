organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-522bee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-0e82d1",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-16f6d4",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-f6f8cb",
  "org.scalablytyped" %%% "header-case" % "1.0.1-e74d9e",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-5d3e21",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-a106fc",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-d9d6b6",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-3b0b93",
  "org.scalablytyped" %%% "no-case" % "2.3.2-4ee13c",
  "org.scalablytyped" %%% "param-case" % "2.1.1-cfcde0",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-c981aa",
  "org.scalablytyped" %%% "path-case" % "2.1.1-0b0497",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-6b355f",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-e3b150",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-44c134",
  "org.scalablytyped" %%% "title-case" % "2.1.1-6e2810",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-2b2ae9",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-30186c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        