package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indentation result representing where indentation should be placed
  */
trait IndentationResult extends StObject {
  
  /**
    * The number of columns the indent should be at relative to the position's column.
    */
  var indentation: Double
  
  /**
    * The base position in the document that the indent should be relative to
    */
  var position: Double
}
object IndentationResult {
  
  inline def apply(indentation: Double, position: Double): IndentationResult = {
    val __obj = js.Dynamic.literal(indentation = indentation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationResult]
  }
  
  extension [Self <: IndentationResult](x: Self) {
    
    inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
