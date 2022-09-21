package typings.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dashjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def supportsMediaSource(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMediaSource")().asInstanceOf[Boolean]

type CapabilitiesFilter = js.Function1[/* representation */ Representation, Boolean]

type ProtectionDataSet = StringDictionary[ProtectionData]

type RequestFilter = js.Function1[/* request */ LicenseRequest, js.Promise[Any]]

type ResponseFilter = js.Function1[/* response */ LicenseResponse, js.Promise[Any]]

type TrackSelectionFunction = js.Function1[/* tracks */ js.Array[MediaInfo], js.Array[MediaInfo]]
