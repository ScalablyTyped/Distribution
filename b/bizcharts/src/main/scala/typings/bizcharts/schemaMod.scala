package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("bizcharts/lib/geometry/Schema", JSImport.Default)
  @js.native
  open class default () extends SchemaGeom
  
  type ISchemaGemoProps = IBaseGemoProps
  
  @js.native
  trait SchemaGeom
    extends typings.bizcharts.geometryBaseMod.default[ISchemaGemoProps]
}
