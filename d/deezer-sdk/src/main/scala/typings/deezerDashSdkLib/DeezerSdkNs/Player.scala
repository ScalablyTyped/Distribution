package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:
  * {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  * {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
  * {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
@js.native
trait Player extends js.Object {
  /**
    * Append a track to the queue of the current player.
    *
    * To remove a track from the queue, you will need to reset the queue using the playTracks method.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def addToQueue(trackIds: js.Array[java.lang.String]): scala.Unit = js.native
  def addToQueue(
    trackIds: js.Array[java.lang.String],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Set the order of the current list of tracks.
    *
    * Attention, this method does not add or remove tracks from the play queue.
    * Use the addToQueue method to add a track or the playTracks method to remove a track by resetting
    * the play queue.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def changeTrackOrder(trackIds: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Get the position in the queue of the currently playing track.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getCurrentIndex(): scala.Double = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getCurrentTrack(): Track = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getMute(): scala.Boolean = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getRepeat(): RepeatMode = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getShuffle(): scala.Boolean = js.native
  /**
    * Get the tracks in the queue of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getTrackList(): js.Array[Track] = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getVolume(): scala.Double = js.native
  //#endregion
  //#region The player properties
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def isPlaying(): scala.Boolean = js.native
  /**
    * Tell the player to read the next track.
    *
    * The behavior of this method will depend on the RepeatMode of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def next(): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def pause(): scala.Unit = js.native
  //#endregion
  //#region Control a player
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def play(): scala.Unit = js.native
  /**
    * Load and play an album into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playAlbum(albumId: scala.Double): scala.Unit = js.native
  def playAlbum(albumId: scala.Double, autoplay: scala.Boolean): scala.Unit = js.native
  def playAlbum(albumId: scala.Double, autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playAlbum(albumId: scala.Double, autoplay: scala.Boolean, index: scala.Double, offset: scala.Double): scala.Unit = js.native
  def playAlbum(
    albumId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playAlbum(
    albumId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playAlbum(
    albumId: scala.Double,
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playAlbum(albumId: scala.Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]): scala.Unit = js.native
  /**
    * Load and play an episode or a list of episodes into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playEpisodes(episodeIds: js.Array[java.lang.String]): scala.Unit = js.native
  def playEpisodes(episodeIds: js.Array[java.lang.String], autoplay: scala.Boolean): scala.Unit = js.native
  def playEpisodes(episodeIds: js.Array[java.lang.String], autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[java.lang.String],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Load and play external MP3 sources into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playExternalTracks(mp3Sources: js.Array[Mp3Source]): scala.Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: scala.Boolean): scala.Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Load and play a playlist into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playPlaylist(playlistId: scala.Double): scala.Unit = js.native
  def playPlaylist(playlistId: scala.Double, autoplay: scala.Boolean): scala.Unit = js.native
  def playPlaylist(playlistId: scala.Double, autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playPlaylist(playlistId: scala.Double, autoplay: scala.Boolean, index: scala.Double, offset: scala.Double): scala.Unit = js.native
  def playPlaylist(
    playlistId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPlaylist(
    playlistId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPlaylist(
    playlistId: scala.Double,
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPlaylist(playlistId: scala.Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]): scala.Unit = js.native
  /**
    * Load and play a podcast into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playPodcast(podcastId: scala.Double): scala.Unit = js.native
  def playPodcast(podcastId: scala.Double, autoplay: scala.Boolean): scala.Unit = js.native
  def playPodcast(podcastId: scala.Double, autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playPodcast(podcastId: scala.Double, autoplay: scala.Boolean, index: scala.Double, offset: scala.Double): scala.Unit = js.native
  def playPodcast(
    podcastId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPodcast(
    podcastId: scala.Double,
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPodcast(
    podcastId: scala.Double,
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playPodcast(podcastId: scala.Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]): scala.Unit = js.native
  /**
    * Load and play a radio into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playRadio(id: scala.Double): scala.Unit = js.native
  def playRadio(id: scala.Double, radioType: RadioType): scala.Unit = js.native
  def playRadio(id: scala.Double, radioType: RadioType, autoplay: scala.Boolean): scala.Unit = js.native
  def playRadio(id: scala.Double, radioType: RadioType, autoplay: scala.Boolean, offset: scala.Double): scala.Unit = js.native
  def playRadio(
    id: scala.Double,
    radioType: RadioType,
    autoplay: scala.Boolean,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playRadio(
    id: scala.Double,
    radioType: RadioType,
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playRadio(
    id: scala.Double,
    radioType: RadioType,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * The official docs for this method are incomplete, but the existing docs and a
    * {@link https://github.com/deezer/javascript-samples/blob/master/player_basic.html | usage example}
    * suggest the same parameters as in {@link playRadio},
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playSmartRadio(id: scala.Double): scala.Unit = js.native
  def playSmartRadio(id: scala.Double, radioType: RadioType): scala.Unit = js.native
  def playSmartRadio(id: scala.Double, radioType: RadioType, autoplay: scala.Boolean): scala.Unit = js.native
  def playSmartRadio(id: scala.Double, radioType: RadioType, autoplay: scala.Boolean, offset: scala.Double): scala.Unit = js.native
  def playSmartRadio(
    id: scala.Double,
    radioType: RadioType,
    autoplay: scala.Boolean,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playSmartRadio(
    id: scala.Double,
    radioType: RadioType,
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playSmartRadio(
    id: scala.Double,
    radioType: RadioType,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  //#region Load tracks to a player
  // There may be more overloads possible, but the defined ones should suffice for all
  // practical purposes.
  /**
    * Load and play a track or list of tracks into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param index The index of the first track to play in the list
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playTracks(trackIds: js.Array[java.lang.String]): scala.Unit = js.native
  def playTracks(trackIds: js.Array[java.lang.String], autoplay: scala.Boolean): scala.Unit = js.native
  def playTracks(trackIds: js.Array[java.lang.String], autoplay: scala.Boolean, index: scala.Double): scala.Unit = js.native
  def playTracks(
    trackIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double
  ): scala.Unit = js.native
  def playTracks(
    trackIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    offset: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playTracks(
    trackIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    index: scala.Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playTracks(
    trackIds: js.Array[java.lang.String],
    autoplay: scala.Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  def playTracks(
    trackIds: js.Array[java.lang.String],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Tell the player to read the previous track.
    *
    * The behavior of this method will depend on the RepeatMode of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def prev(): scala.Unit = js.native
  /**
    * Set the position of the reader head in the currently playing track.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def seek(positionPercentFloat: scala.Double): scala.Unit = js.native
  /**
    * Hide the queue and current track information.
    *
    * @param trackInfo Replaces the current track information.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    *
    */
  def setBlindTestMode(blindTestMode: scala.Boolean): scala.Unit = js.native
  def setBlindTestMode(blindTestMode: scala.Boolean, trackInfo: deezerDashSdkLib.Anon_Artist): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setMute(mute: scala.Boolean): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setRepeat(repeatMode: RepeatMode): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setShuffle(shuffle: scala.Boolean): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setVolume(volumePercentInt: scala.Double): scala.Unit = js.native
}

