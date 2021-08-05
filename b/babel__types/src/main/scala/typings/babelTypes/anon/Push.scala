package typings.babelTypes.anon

import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Push extends StObject {
  
  def buildUndefinedNode(): Node
  
  def push(value: Init): Unit
}
object Push {
  
  inline def apply(buildUndefinedNode: () => Node, push: Init => Unit): Push = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push]
  }
  
  extension [Self <: Push](x: Self) {
    
    inline def setBuildUndefinedNode(value: () => Node): Self = StObject.set(x, "buildUndefinedNode", js.Any.fromFunction0(value))
    
    inline def setPush(value: Init => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
