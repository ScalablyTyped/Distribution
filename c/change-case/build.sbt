organization := "org.scalablytyped"
name := "change-case"
version := "3.1.0-cd6ca7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-3e9ce5",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-dac90b",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-e11c7f",
  "org.scalablytyped" %%% "header-case" % "1.0.1-f6cbc0",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-1ff943",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-cfc1ca",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-d7e181",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-c8d98e",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c732b8",
  "org.scalablytyped" %%% "param-case" % "2.1.1-5191b5",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-ca0985",
  "org.scalablytyped" %%% "path-case" % "2.1.1-403e25",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-2dabea",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-70192e",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-2124ef",
  "org.scalablytyped" %%% "title-case" % "2.1.1-e09baa",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-db1c64",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-6a1068")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        