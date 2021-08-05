package typings.blueprintjsTable

import typings.blueprintjsTable.tableQuadrantStackCacheMod.ScrollKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blueprintjsTableStrings {
  
  @js.native
  sealed trait horizontal extends StObject
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait scrollLeft
    extends StObject
       with ScrollKey
  inline def scrollLeft: scrollLeft = "scrollLeft".asInstanceOf[scrollLeft]
  
  @js.native
  sealed trait scrollTop
    extends StObject
       with ScrollKey
  inline def scrollTop: scrollTop = "scrollTop".asInstanceOf[scrollTop]
  
  @js.native
  sealed trait vertical extends StObject
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
