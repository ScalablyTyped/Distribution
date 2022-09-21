package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSGlobal("ts.ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @js.native
  sealed trait AMD
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait CommonJS
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait ES2020
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait ES2022
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait Node16
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait NodeNext
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait None
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait System
    extends StObject
       with ModuleKind
  
  @js.native
  sealed trait UMD
    extends StObject
       with ModuleKind
}
