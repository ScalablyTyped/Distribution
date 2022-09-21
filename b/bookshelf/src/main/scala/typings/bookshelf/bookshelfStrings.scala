package typings.bookshelf

import typings.bookshelf.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookshelfStrings {
  
  @js.native
  sealed trait ASC
    extends StObject
       with SortOrder
  inline def ASC: ASC = "ASC".asInstanceOf[ASC]
  
  @js.native
  sealed trait DESC
    extends StObject
       with SortOrder
  inline def DESC: DESC = "DESC".asInstanceOf[DESC]
  
  @js.native
  sealed trait asc_
    extends StObject
       with SortOrder
  inline def asc_ : asc_ = "asc".asInstanceOf[asc_]
  
  @js.native
  sealed trait desc_
    extends StObject
       with SortOrder
  inline def desc_ : desc_ = "desc".asInstanceOf[desc_]
}
