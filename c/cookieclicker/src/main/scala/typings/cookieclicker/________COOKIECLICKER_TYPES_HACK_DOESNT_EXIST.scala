package typings.cookieclicker

import typings.cookieclicker.Game.PseudoBoolean
import typings.cookieclicker.Game.PseudoNull
import typings.std.HTMLAudioElement
import typings.std.MediaElementAudioSourceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// You have to do this to have an optional namespace, ugh
object ________COOKIECLICKER_TYPES_HACK_DOESNT_EXIST {
  
  object Music {
    
    trait Track extends StObject {
      
      var audio: HTMLAudioElement
      
      var canPlay: Boolean
      
      var name: String
      
      var out: MediaElementAudioSourceNode
      
      def play(): Unit
      
      def stop(): Unit
    }
    object Track {
      
      inline def apply(
        audio: HTMLAudioElement,
        canPlay: Boolean,
        name: String,
        out: MediaElementAudioSourceNode,
        play: () => Unit,
        stop: () => Unit
      ): Track = {
        val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], canPlay = canPlay.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), stop = js.Any.fromFunction0(stop))
        __obj.asInstanceOf[Track]
      }
      
      extension [Self <: Track](x: Self) {
        
        inline def setAudio(value: HTMLAudioElement): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        inline def setCanPlay(value: Boolean): Self = StObject.set(x, "canPlay", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOut(value: MediaElementAudioSourceNode): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
        
        inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
        
        inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      }
    }
  }
  
  object Steam {
    
    trait Mod extends StObject {
      
      var dependencies: js.Array[String]
      
      var dir: String
      
      var disabled: Boolean
      
      var id: String
      
      var info: ModInfo
      
      var infoFile: String
      
      var jsFile: Double | PseudoNull
      
      var local: Boolean
      
      var workshop: Boolean
    }
    object Mod {
      
      inline def apply(
        dependencies: js.Array[String],
        dir: String,
        disabled: Boolean,
        id: String,
        info: ModInfo,
        infoFile: String,
        jsFile: Double | PseudoNull,
        local: Boolean,
        workshop: Boolean
      ): Mod = {
        val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infoFile = infoFile.asInstanceOf[js.Any], jsFile = jsFile.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], workshop = workshop.asInstanceOf[js.Any])
        __obj.asInstanceOf[Mod]
      }
      
      extension [Self <: Mod](x: Self) {
        
        inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
        
        inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: ModInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoFile(value: String): Self = StObject.set(x, "infoFile", value.asInstanceOf[js.Any])
        
        inline def setJsFile(value: Double | PseudoNull): Self = StObject.set(x, "jsFile", value.asInstanceOf[js.Any])
        
        inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
        
        inline def setWorkshop(value: Boolean): Self = StObject.set(x, "workshop", value.asInstanceOf[js.Any])
      }
    }
    
    trait ModInfo extends StObject {
      
      var AllowSteamAchievs: js.UndefOr[PseudoBoolean] = js.undefined
      
      var Author: String
      
      var Date: String
      
      var Dependencies: js.UndefOr[js.Array[String]] = js.undefined
      
      var Description: String
      
      var Disabled: js.UndefOr[PseudoBoolean] = js.undefined
      
      var GameVersion: Double
      
      var ID: String
      
      var LaunguagePacks: js.Array[String]
      
      var ModVersion: Double
      
      var Name: String
    }
    object ModInfo {
      
      inline def apply(
        Author: String,
        Date: String,
        Description: String,
        GameVersion: Double,
        ID: String,
        LaunguagePacks: js.Array[String],
        ModVersion: Double,
        Name: String
      ): ModInfo = {
        val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GameVersion = GameVersion.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LaunguagePacks = LaunguagePacks.asInstanceOf[js.Any], ModVersion = ModVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ModInfo]
      }
      
      extension [Self <: ModInfo](x: Self) {
        
        inline def setAllowSteamAchievs(value: PseudoBoolean): Self = StObject.set(x, "AllowSteamAchievs", value.asInstanceOf[js.Any])
        
        inline def setAllowSteamAchievsUndefined: Self = StObject.set(x, "AllowSteamAchievs", js.undefined)
        
        inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
        
        inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
        
        inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "Dependencies", value.asInstanceOf[js.Any])
        
        inline def setDependenciesUndefined: Self = StObject.set(x, "Dependencies", js.undefined)
        
        inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "Dependencies", js.Array(value*))
        
        inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: PseudoBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
        
        inline def setGameVersion(value: Double): Self = StObject.set(x, "GameVersion", value.asInstanceOf[js.Any])
        
        inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
        
        inline def setLaunguagePacks(value: js.Array[String]): Self = StObject.set(x, "LaunguagePacks", value.asInstanceOf[js.Any])
        
        inline def setLaunguagePacksVarargs(value: String*): Self = StObject.set(x, "LaunguagePacks", js.Array(value*))
        
        inline def setModVersion(value: Double): Self = StObject.set(x, "ModVersion", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      }
    }
    
    type SendCallback = js.Function1[/* data */ Any, Unit]
  }
}
