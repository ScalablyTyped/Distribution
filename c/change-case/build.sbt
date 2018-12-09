organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-db1506"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-51d8ce",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-bfe39b",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-8b4eeb",
  "org.scalablytyped" %%% "header-case" % "1.0.1-88e726",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-5e6888",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-b4552e",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-591733",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-631fe3",
  "org.scalablytyped" %%% "no-case" % "2.3.2-8c6c74",
  "org.scalablytyped" %%% "param-case" % "2.1.1-f8af63",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-00e83b",
  "org.scalablytyped" %%% "path-case" % "2.1.1-c6aa3d",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-87f552",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-c5cb9d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-60e962",
  "org.scalablytyped" %%% "title-case" % "2.1.1-9c2948",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-2600b8",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-fd6b45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        