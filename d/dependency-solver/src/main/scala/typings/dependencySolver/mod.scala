package typings.dependencySolver

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dependency-solver", "addMissingKeys")
  @js.native
  def addMissingKeys(g: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  
  @JSImport("dependency-solver", "getDependedBy")
  @js.native
  def getDependedBy(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = js.native
  
  @JSImport("dependency-solver", "getDependencyLines")
  @js.native
  def getDependencyLines(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = js.native
  
  @JSImport("dependency-solver", "getEdges")
  @js.native
  def getEdges(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = js.native
  
  @JSImport("dependency-solver", "getInDegree")
  @js.native
  def getInDegree(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = js.native
  
  @JSImport("dependency-solver", "solve")
  @js.native
  def solve(g: StringDictionary[js.Array[String]]): js.Array[String] = js.native
}
