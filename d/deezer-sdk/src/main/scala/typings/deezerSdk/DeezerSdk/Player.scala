package typings.deezerSdk.DeezerSdk

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
  def addToQueue(trackIds: js.Array[String]): Unit = js.native
  def addToQueue(trackIds: js.Array[String], onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
  /**
    * Set the order of the current list of tracks.
    *
    * Attention, this method does not add or remove tracks from the play queue.
    * Use the addToQueue method to add a track or the playTracks method to remove a track by resetting
    * the play queue.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def changeTrackOrder(trackIds: js.Array[String]): Unit = js.native
  /**
    * Get the position in the queue of the currently playing track.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getCurrentIndex(): Double = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getCurrentTrack(): Track = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getMute(): Boolean = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getRepeat(): RepeatMode = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getShuffle(): Boolean = js.native
  /**
    * Get the tracks in the queue of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getTrackList(): js.Array[Track] = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def getVolume(): Double = js.native
  //#endregion
  //#region The player properties
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
    */
  def isPlaying(): Boolean = js.native
  /**
    * Tell the player to read the next track.
    *
    * The behavior of this method will depend on the RepeatMode of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def next(): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def pause(): Unit = js.native
  //#endregion
  //#region Control a player
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def play(): Unit = js.native
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
  def playAlbum(albumId: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double, offset: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: Boolean): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: Boolean, index: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: Boolean, index: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(
    albumId: Double,
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playAlbum(albumId: Double, autoplay: Boolean, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
  def playAlbum(albumId: Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playEpisodes(episodeIds: js.Array[String]): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: js.UndefOr[scala.Nothing], index: Double, offset: Double): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: Boolean): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: Boolean, index: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: Boolean, index: Double): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(
    episodeIds: js.Array[String],
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playEpisodes(episodeIds: js.Array[String], onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playExternalTracks(mp3Sources: js.Array[Mp3Source]): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: Boolean): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: Boolean, index: Double): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(
    mp3Sources: js.Array[Mp3Source],
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playExternalTracks(mp3Sources: js.Array[Mp3Source], onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playPlaylist(playlistId: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double, offset: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: Boolean): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: Boolean, index: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: Boolean, index: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(
    playlistId: Double,
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPlaylist(playlistId: Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playPodcast(podcastId: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: js.UndefOr[scala.Nothing], index: Double, offset: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: Boolean): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: Boolean, index: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: Boolean, index: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(
    podcastId: Double,
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playPodcast(podcastId: Double, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
  /**
    * Load and play a radio into the current player.
    *
    * @param autoplay Whether to start playing the queue when the player has loaded.
    * Default: true. Setting this to false will cancel the expected behavior of the offset parameter.
    * @param offset The position in seconds where to start playing the track
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
    */
  def playRadio(id: Double): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: js.UndefOr[scala.Nothing], autoplay: Boolean): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: js.UndefOr[scala.Nothing], autoplay: Boolean, offset: Double): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: RadioType): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: RadioType, autoplay: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: RadioType, autoplay: Boolean): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: RadioType, autoplay: Boolean, offset: Double): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playRadio(id: Double, radioType: RadioType, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playSmartRadio(id: Double): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: js.UndefOr[scala.Nothing], autoplay: Boolean): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: js.UndefOr[scala.Nothing], autoplay: Boolean, offset: Double): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: RadioType): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: RadioType, autoplay: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: RadioType, autoplay: Boolean): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: RadioType, autoplay: Boolean, offset: Double): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(
    id: Double,
    radioType: RadioType,
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playSmartRadio(id: Double, radioType: RadioType, onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
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
  def playTracks(trackIds: js.Array[String]): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: js.UndefOr[scala.Nothing], index: Double, offset: Double): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: Boolean): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: Boolean, index: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: Boolean, index: Double): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    offset: js.UndefOr[scala.Nothing],
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], autoplay: Boolean, index: Double, offset: Double): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    offset: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    index: Double,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(
    trackIds: js.Array[String],
    autoplay: Boolean,
    onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]
  ): Unit = js.native
  def playTracks(trackIds: js.Array[String], onTracksLoaded: js.Function1[/* playQueue */ PlayQueue, Unit]): Unit = js.native
  /**
    * Tell the player to read the previous track.
    *
    * The behavior of this method will depend on the RepeatMode of the player.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def prev(): Unit = js.native
  /**
    * Set the position of the reader head in the currently playing track.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def seek(positionPercentFloat: Double): Unit = js.native
  /**
    * Hide the queue and current track information.
    *
    * @param trackInfo Replaces the current track information.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    *
    */
  def setBlindTestMode(blindTestMode: Boolean): Unit = js.native
  def setBlindTestMode(blindTestMode: Boolean, trackInfo: typings.deezerSdk.anon.Artist): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setMute(mute: Boolean): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setRepeat(repeatMode: RepeatMode): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setShuffle(shuffle: Boolean): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/controls | Control a player}
    */
  def setVolume(volumePercentInt: Double): Unit = js.native
}

