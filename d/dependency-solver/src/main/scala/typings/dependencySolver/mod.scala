package typings.dependencySolver

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dependency-solver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addMissingKeys(g: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMissingKeys")(g.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[String]]]
  
  @scala.inline
  def getDependedBy(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependedBy")(g.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Double]]
  
  @scala.inline
  def getDependencyLines(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyLines")(g.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, String]]]
  
  @scala.inline
  def getEdges(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEdges")(g.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Double]]
  
  @scala.inline
  def getInDegree(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInDegree")(g.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, String]]]
  
  @scala.inline
  def solve(g: StringDictionary[js.Array[String]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("solve")(g.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
