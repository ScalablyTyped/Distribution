package typings.dependencySolver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dependency-solver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addMissingKeys(g: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  
  def getDependedBy(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = js.native
  
  def getDependencyLines(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = js.native
  
  def getEdges(g: StringDictionary[js.Array[String]]): StringDictionary[Double] = js.native
  
  def getInDegree(g: StringDictionary[js.Array[String]]): js.Array[js.Tuple2[String, String]] = js.native
  
  def solve(g: StringDictionary[js.Array[String]]): js.Array[String] = js.native
}
