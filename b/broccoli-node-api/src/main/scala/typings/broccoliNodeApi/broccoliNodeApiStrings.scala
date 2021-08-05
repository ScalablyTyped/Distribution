package typings.broccoliNodeApi

import typings.broccoliNodeApi.mod.Node
import typings.broccoliNodeApi.mod.NodeInfo
import typings.broccoliNodeApi.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broccoliNodeApiStrings {
  
  @js.native
  sealed trait __broccoliFeatures__
    extends StObject
       with Node
  inline def __broccoliFeatures__ : __broccoliFeatures__ = "__broccoliFeatures__".asInstanceOf[__broccoliFeatures__]
  
  @js.native
  sealed trait __broccoliGetInfo__
    extends StObject
       with Node
  inline def __broccoliGetInfo__ : __broccoliGetInfo__ = "__broccoliGetInfo__".asInstanceOf[__broccoliGetInfo__]
  
  @js.native
  sealed trait getCallbackObject
    extends StObject
       with NodeInfo
  inline def getCallbackObject: getCallbackObject = "getCallbackObject".asInstanceOf[getCallbackObject]
  
  @js.native
  sealed trait inputNodes
    extends StObject
       with NodeInfo
  inline def inputNodes: inputNodes = "inputNodes".asInstanceOf[inputNodes]
  
  @js.native
  sealed trait needsCache
    extends StObject
       with NodeInfo
  inline def needsCache: needsCache = "needsCache".asInstanceOf[needsCache]
  
  @js.native
  sealed trait persistentOutput
    extends StObject
       with NodeInfo
  inline def persistentOutput: persistentOutput = "persistentOutput".asInstanceOf[persistentOutput]
  
  @js.native
  sealed trait setup
    extends StObject
       with NodeInfo
  inline def setup: setup = "setup".asInstanceOf[setup]
  
  @js.native
  sealed trait source
    extends StObject
       with NodeType
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait sourceDirectory
    extends StObject
       with NodeInfo
  inline def sourceDirectory: sourceDirectory = "sourceDirectory".asInstanceOf[sourceDirectory]
  
  @js.native
  sealed trait trackInputChanges
    extends StObject
       with NodeInfo
  inline def trackInputChanges: trackInputChanges = "trackInputChanges".asInstanceOf[trackInputChanges]
  
  @js.native
  sealed trait transform
    extends StObject
       with NodeType
  inline def transform: transform = "transform".asInstanceOf[transform]
  
  @js.native
  sealed trait volatile
    extends StObject
       with NodeInfo
  inline def volatile: volatile = "volatile".asInstanceOf[volatile]
  
  @js.native
  sealed trait watched
    extends StObject
       with NodeInfo
  inline def watched: watched = "watched".asInstanceOf[watched]
}
