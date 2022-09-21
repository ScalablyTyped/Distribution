package typings.cssWhat.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttributeAction extends StObject
@JSImport("css-what/lib/es/types", "AttributeAction")
@js.native
object AttributeAction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttributeAction & String] = js.native
  
  @js.native
  sealed trait Any
    extends StObject
       with AttributeAction
  /* "any" */ val Any: typings.cssWhat.typesMod.AttributeAction.Any & String = js.native
  
  @js.native
  sealed trait Element
    extends StObject
       with AttributeAction
  /* "element" */ val Element: typings.cssWhat.typesMod.AttributeAction.Element & String = js.native
  
  @js.native
  sealed trait End
    extends StObject
       with AttributeAction
  /* "end" */ val End: typings.cssWhat.typesMod.AttributeAction.End & String = js.native
  
  @js.native
  sealed trait Equals
    extends StObject
       with AttributeAction
  /* "equals" */ val Equals: typings.cssWhat.typesMod.AttributeAction.Equals & String = js.native
  
  @js.native
  sealed trait Exists
    extends StObject
       with AttributeAction
  /* "exists" */ val Exists: typings.cssWhat.typesMod.AttributeAction.Exists & String = js.native
  
  @js.native
  sealed trait Hyphen
    extends StObject
       with AttributeAction
  /* "hyphen" */ val Hyphen: typings.cssWhat.typesMod.AttributeAction.Hyphen & String = js.native
  
  @js.native
  sealed trait Not
    extends StObject
       with AttributeAction
  /* "not" */ val Not: typings.cssWhat.typesMod.AttributeAction.Not & String = js.native
  
  @js.native
  sealed trait Start
    extends StObject
       with AttributeAction
  /* "start" */ val Start: typings.cssWhat.typesMod.AttributeAction.Start & String = js.native
}
