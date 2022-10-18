package typings.barcoEventmaster

import typings.barcoEventmaster.mod.NotificationType
import typings.barcoEventmaster.mod.UserType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barcoEventmasterStrings {
  
  @js.native
  sealed trait AUXDestChanged
    extends StObject
       with NotificationType
  inline def AUXDestChanged: AUXDestChanged = "AUXDestChanged".asInstanceOf[AUXDestChanged]
  
  @js.native
  sealed trait BGSourceChanged
    extends StObject
       with NotificationType
  inline def BGSourceChanged: BGSourceChanged = "BGSourceChanged".asInstanceOf[BGSourceChanged]
  
  @js.native
  sealed trait CueChanged
    extends StObject
       with NotificationType
  inline def CueChanged: CueChanged = "CueChanged".asInstanceOf[CueChanged]
  
  @js.native
  sealed trait FrameChanged
    extends StObject
       with NotificationType
  inline def FrameChanged: FrameChanged = "FrameChanged".asInstanceOf[FrameChanged]
  
  @js.native
  sealed trait InputCfgChanged
    extends StObject
       with NotificationType
  inline def InputCfgChanged: InputCfgChanged = "InputCfgChanged".asInstanceOf[InputCfgChanged]
  
  @js.native
  sealed trait NativeRateChanged
    extends StObject
       with NotificationType
  inline def NativeRateChanged: NativeRateChanged = "NativeRateChanged".asInstanceOf[NativeRateChanged]
  
  @js.native
  sealed trait OutputCfgChanged
    extends StObject
       with NotificationType
  inline def OutputCfgChanged: OutputCfgChanged = "OutputCfgChanged".asInstanceOf[OutputCfgChanged]
  
  @js.native
  sealed trait PresetChanged
    extends StObject
       with NotificationType
  inline def PresetChanged: PresetChanged = "PresetChanged".asInstanceOf[PresetChanged]
  
  @js.native
  sealed trait ScreenDestChanged
    extends StObject
       with NotificationType
  inline def ScreenDestChanged: ScreenDestChanged = "ScreenDestChanged".asInstanceOf[ScreenDestChanged]
  
  @js.native
  sealed trait SourceChanged
    extends StObject
       with NotificationType
  inline def SourceChanged: SourceChanged = "SourceChanged".asInstanceOf[SourceChanged]
  
  @js.native
  sealed trait StillChanged
    extends StObject
       with NotificationType
  inline def StillChanged: StillChanged = "StillChanged".asInstanceOf[StillChanged]
  
  @js.native
  sealed trait destGroupId extends StObject
  inline def destGroupId: destGroupId = "destGroupId".asInstanceOf[destGroupId]
  
  @js.native
  sealed trait destGroupName extends StObject
  inline def destGroupName: destGroupName = "destGroupName".asInstanceOf[destGroupName]
  
  @js.native
  sealed trait destGroupSno extends StObject
  inline def destGroupSno: destGroupSno = "destGroupSno".asInstanceOf[destGroupSno]
  
  @js.native
  sealed trait operator
    extends StObject
       with UserType
  inline def operator: operator = "operator".asInstanceOf[operator]
  
  @js.native
  sealed trait super_user
    extends StObject
       with UserType
  inline def super_user: super_user = "super_user".asInstanceOf[super_user]
}
