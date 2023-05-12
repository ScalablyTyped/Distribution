organization := "org.scalablytyped"
name := "bizcharts"
version := "4.1.20-3eee36"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "antv__adjust" % "0.2.5-d58394",
  "org.scalablytyped" %%% "antv__attr" % "0.3.5-896471",
  "org.scalablytyped" %%% "antv__component" % "0.8.34-1b5e0f",
  "org.scalablytyped" %%% "antv__coord" % "0.4.4-7b2315",
  "org.scalablytyped" %%% "antv__event-emitter" % "0.1.3-f65ae5",
  "org.scalablytyped" %%% "antv__g-base" % "0.5.15-4c86aa",
  "org.scalablytyped" %%% "antv__g-canvas" % "1.9.5-66388e",
  "org.scalablytyped" %%% "antv__g-lite" % "1.0.6-710e87",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-path-generator" % "1.1.17-5e66e5",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-picker" % "1.8.14-1d57b4",
  "org.scalablytyped" %%% "antv__g-plugin-canvas-renderer" % "1.7.20-abc1fb",
  "org.scalablytyped" %%% "antv__g-plugin-dom-interaction" % "1.7.17-d36644",
  "org.scalablytyped" %%% "antv__g-plugin-html-renderer" % "1.7.17-b9a46e",
  "org.scalablytyped" %%% "antv__g-plugin-image-loader" % "1.1.18-5cd5bf",
  "org.scalablytyped" %%% "antv__g2" % "4.2.8-fa139b",
  "org.scalablytyped" %%% "antv__g2plot" % "2.4.20-4919f1",
  "org.scalablytyped" %%% "antv__scale" % "0.4.12-346715",
  "org.scalablytyped" %%% "antv__util" % "3.3.2-5db7d6",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "eventemitter3" % "5.0.1-abf8ed",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-a497a6",
  "org.scalablytyped" %%% "inversify" % "6.0.1-a66d5a",
  "org.scalablytyped" %%% "mana-syringe" % "0.3.2-90da6b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20221230Z-6a9e93",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-error-boundary" % "3.1.4-d163f5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
