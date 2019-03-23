organization := "org.scalablytyped"
name := "bookshelf"
version := "v0.13.0-dt-20190322Z-3a7399"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-052e82",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "chalk" % "2.4.2-273699",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "commander" % "2.19.0-d01a66",
  "org.scalablytyped" %%% "create-error" % "0.3.1-dt-20190322Z-d817bd",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-1f537b",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-63c7a4",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-320cd0",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-b508e6",
  "org.scalablytyped" %%% "knex" % "0.16.3-a5064a",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-46eeb2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b5ce4c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-359637",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-4f6097",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-3442a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-d1745b",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-b311b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        